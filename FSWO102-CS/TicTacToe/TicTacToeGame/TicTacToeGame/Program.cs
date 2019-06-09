using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TicTacToeGame.Classes;

namespace TicTacToeGame
{
    class Program
    {
        class MyFactory
        {
            public static void ChangeAlias(IPlayer player, IRanked ranked)
            {
                IPlayer myPlayer = player;
                IRanked myRanked = ranked;

                myRanked.Wins();

                Console.WriteLine($"Are you sure you want to change {myPlayer.Alias}?");
                Console.WriteLine($"You are in fact number {myRanked.Ranking}");
                Console.WriteLine($"And you have won {myRanked.GamesWon} games!");
            }
        }

        static void Main(string[] args)
        {
            RankedPlayer bob = new RankedPlayer("Cupo", "Bob", "Roberts", 1, 23, 12, 11, 0);
            MyFactory.ChangeAlias(bob, bob);
            Console.WriteLine(bob.GamesWon);
        }

    }
}
