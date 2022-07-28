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

		Mixer.Info[] mixerInfos = AudioSystem.getMixerInfo();

		Main.log( mixerInfos.length + " mixers detected." );

		// Get and list all installed audio mixers
		for ( var info : mixerInfos )
		{
			Main.log( info.toString() );
		}
	}
}