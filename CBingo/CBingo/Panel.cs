﻿using Gdk;
using Gtk;
using System;
using System.Collections.Generic;

namespace CBingo
{
	

	public class Panel
	{
		private static Color COLOR_GREEN = new Color (0, 255, 0);
		private List<Button> buttons = new List<Button> ();
		public Panel (Container parent){
			Table table = new Table (9,10,true);
			for (int index = 0; index < 9; index++) {
				Button button = new Button ();
				button.Label = (index + 1).ToString ();
				button.Visible = true;
				uint row = (uint)(index / 10);
				uint column = (uint)(index % 10);
				table.Attach (button, column, (uint)(column + 1), row, row + 1);
				buttons.Add (button);
			}
			table.Visible = true;
			parent.Add (table);
		}
		public void MarcarNumero(int numero){
			Button button = buttons [numero - 1];
			button.ModifyBg(StateType.Normal, COLOR_GREEN);

		}
}
}