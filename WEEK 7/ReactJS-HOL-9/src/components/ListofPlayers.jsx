import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat', score: 85 },
    { name: 'Rohit', score: 90 },
    { name: 'Gill', score: 60 },
    { name: 'Surya', score: 40 },
    { name: 'Iyer', score: 75 },
    { name: 'Pant', score: 55 },
    { name: 'Jadeja', score: 95 },
    { name: 'Ashwin', score: 45 },
    { name: 'Bumrah', score: 80 },
    { name: 'Shami', score: 65 },
    { name: 'Kuldeep', score: 70 },
  ];

  const filteredPlayers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h2>Players with Score below 70</h2>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
