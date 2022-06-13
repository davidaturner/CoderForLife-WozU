using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace WindowsFormsSQLiteTester
{
    internal static class Program
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            System.Console.WriteLine("I have consoled!");
            System.Diagnostics.Debug.WriteLine("I have debugged");
            Application.Run(new Form1());
        }
    }
}
