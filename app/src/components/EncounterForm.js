import React from 'react';

const EncounterForm = ({ level, setLevel, climateZone, setClimateZone, hostility, setHostility, biome, setBiome, onSubmit }) => {
    return (
        <form onSubmit={onSubmit} className="form-container">
            <div className="form-row">
                <label>Encounter level:</label>
                <input type="number" value={level} onChange={(e) => setLevel(e.target.value)}/>
            </div>
            <div className="form-row">
                <label>Biome:</label>
                <select
                    value={biome}
                    onChange={(e) => setBiome(e.target.value)}>
                    <option value="">Select Biome</option>
                    <option value="Forest">Forest</option>
                    <option value="Grasslands">Grasslands</option>
                    <option value="Mountains">Mountains</option>
                    <option value="Hills">Hills</option>
                    <option value="Ocean">Ocean</option>
                    <option value="Aquatic">Aquatic</option>
                    <option value="Coasts">Coasts</option>
                    <option value="Tundra">Tundra</option>
                    <option value="Desert">Desert</option>
                    <option value="Caverns">Caverns</option>
                    <option value="Wetlands">Wetlands</option>
                </select>
            </div>
            <div className="form-row">
                <label>Climate Zone:</label>
                <select
                    value={climateZone}
                    onChange={(e) => setClimateZone(e.target.value)}>
                    <option value="">Select Climate Zone</option>
                    <option value="Temperate">Temperate</option>
                    <option value="Cold">Cold</option>
                    <option value="Warm">Warm</option>
                </select>
            </div>
            <div className="form-row">
                <label>Hostility:</label>
                <select
                    value={hostility}
                    onChange={(e) => setHostility(e.target.value)}>
                    <option value="">Select Hostility</option>
                    <option value="Aggressive creatures">Aggressive creatures</option>
                    <option value="Neutral creatures">Neutral creatures</option>
                </select>
            </div>
            <button type="submit">Get Encounters</button>
        </form>
    );
};

export default EncounterForm;