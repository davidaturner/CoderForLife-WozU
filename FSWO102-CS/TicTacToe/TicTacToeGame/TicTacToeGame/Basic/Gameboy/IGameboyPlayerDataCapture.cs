﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public interface IGameboyPlayerDataCapture
    {
        IPlayer CreateNew();
        IRanked CreateNewRanked();

        IPlayer RetrieveExisting();
        IRanked RetrieveRanked();
    }
}