package me.av306.multipleaudio;

public class Main
{
	public static void main( String[] args )
	{
		log( "Welcome to MultipleAudio v0.0.1!" );

		new MultipleAudioCore().run();
	}

	public static void log( String message )
	{
		System.out.println( "[MultipleAudio] " + message );
	}
}