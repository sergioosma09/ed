using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{
	public MainWindow () : base (Gtk.WindowType.Toplevel)
	{
		Build ();
		showAll (button1);
		button1.Clicked += delegate {
			int numero1= int.Parse(entry1.Text);
			int numero2=int.Parse(entry2.Text);
			int resultado=numero1 + numero2;
			labelResultado.Text=resultado.ToString();
		};
	}

	private void showAll(Container container) {
		foreach (Widget child in container.Children) {
			child.Visible = true;
			if (child is Container)
				showAll ((Container)child);
		}
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}
