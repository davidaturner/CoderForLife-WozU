using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGame.Classes
{
    public class SimplePlayLinkedList : IPlayRepeatable
    {
        Node head;
        private class Node
        {
            public IPlay nodeValue;
            public Node next;

            public Node(IPlay nodeValue)
            {
                this.nodeValue = nodeValue;
                next = null;
            }
        }

        public List<IPlay> Playback()
        {
            if (head == null)
            {
                return null;
            }

            List<IPlay> playback = new List<IPlay>();
            Node current = head;
            while(current != null)
            {
                playback.Add(current.nodeValue);
                current = current.next;
            }
            return playback;
        }

        public void Seal(IPlay play)
        {
            Node current = new Node(play);

            if (head != null)
            {
                current.next = head;
            }

            head = current;
        }

        public IPlay Unseal()
        {
            return head.nodeValue;
        }

    }
}
