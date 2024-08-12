import React from 'react';

const EncounterTable = ({encounterTable}) => {
    if (encounterTable.length === 0) {
        return null;
    }

    return (
        <table>
            <thead>
            <tr>
                <th>Weight</th>
                <th>Creature</th>
                <th>Count</th>
            </tr>
            </thead>
            <tbody>
            {encounterTable.map((encounter, index) => (
                <tr key={index}>
                    <td>{encounter.weight}</td>
                    <td>{encounter.encounterName}</td>
                    <td>{encounter.count}</td>
                </tr>
            ))}
            </tbody>
        </table>
    )
};

export default EncounterTable;