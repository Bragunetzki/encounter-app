import React, {useEffect, useState} from 'react';
import EncounterForm from './components/EncounterForm';
import EncounterTable from './components/EncounterTable';
import './App.css';

const App = () => {
    const [loading, setLoading] = useState(false)
    const [level, setLevel] = useState('');
    const [biome, setBiome] = useState('');
    const [climateZone, setClimateZone] = useState('');
    const [hostility, setHostility] = useState('');
    const [encounterTable, setEncounterTable] = useState([]);

    const fetchEncounterTable = async () => {
        setLoading(true);
        try {
            const response = await fetch(`/api/encounters/table?level=${level}&climateZone=${climateZone}&biome=${biome}&hostility=${hostility}`);
            const data = await response.json();
            setEncounterTable(data);
        } catch (error) {
            console.error("Error fetching encounter table:", error);
        }
        setLoading(false);
    };

    const handleSubmit = (event) => {
        event.preventDefault();
        fetchEncounterTable();
    };

    if (loading) {
        return <p>Loading...</p>;
    }

    return (
        <div className="App">
            <header className="App-header">
                <div className="App-intro">
                    <h2>Encounter Table</h2>
                    <EncounterForm
                        level={level}
                        setLevel={setLevel}
                        climateZone={climateZone}
                        setClimateZone={setClimateZone}
                        hostility={hostility}
                        setHostility={setHostility}
                        biome={biome}
                        setBiome={setBiome}
                        onSubmit={handleSubmit}
                    />

                    {loading && <p>Loading...</p>}

                    <EncounterTable encounterTable={encounterTable} />
                </div>
            </header>
        </div>
    );
}

export default App;