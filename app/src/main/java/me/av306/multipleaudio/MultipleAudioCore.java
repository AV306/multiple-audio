package me.av306.multipleaudio;

import javax.sound.sampled.AudioSystem;

public class MultipleAudioCore
{
	public static MultipleAudioCore instance = null;
	
	public MultipleAudioCore()
	{
		instance = this;
	}

	public void run()
	{
		Main.log( "MultipleAudioCore started!" );

		Main.log( "Detecting audio mixers..." );
		// Get and list all installed audio mixers
		for ( var info : AudioSystem.getMixerInfo() )
		{
			Main.log( info.toString() );
		}
	}
}