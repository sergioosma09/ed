using Gdk;
using Gtk;
using System;
using System.Collections.Generic;

public partial class MainWindow: Gtk.Window
{
	private static Color COLOR_GREEN = new Color (0, 255, 0);
	public MainWindow () : base (Gtk.WindowType.Toplevel)
	{
		Build ();
		List<Button> buttons = new List<Button> ();
			Table table = new Table (9, 10, true);
		for (int index = 0; index < 90; index++) {
			Button button = new Button ();
			button.Label = (index + 1).ToString();
			button.Visible = true;
			uint row = (uint)(index / 10);
			uint column = (uint)(index % 10);
			table.Attach (button, column , (uint)(column + 1), row, row+1);
			buttons.Add (button);
		}
		table.Visible = true;
		VBoxMain.Add (table);

		List<int> bolas = new List<int> ();
		for (int bola = 1; bola <= 90; bola++)
			bolas.Add (bola);

		Random random = new Random ();

		buttonAdelante.Clicked += delegate {
			int indexAleatorio = random.Next (bolas.Count);
			int bola= bolas[indexAleatorio];
			bolas.Remove(bola);
			int indexPanel = bola - 1;
			buttons[indexPanel].ModifyBg(StateType.Normal, COLOR_GREEN);
//		buttonAdelante.ModifyBg(StateType.Normal, COLOR_GREEN);
		};
	
//	for (uint row=0;row<9;row++)
//		for(uint column=0;column<10;column++){
//				int index = (int)(row * 10 + column);
//				Button button = new Button ();
//				button.Label = (index + 1).ToString();
//				button.Visible = true;
//				table.Attach (button, (uint)column, (uint)(column + 1), row, row+1);
//		
	
	}
	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}
	