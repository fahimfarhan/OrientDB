package com.aplications;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Fahim on 7/9/2017.
 */
public class Notification {
    Notification() throws IOException {
        // open the sound file as a Java input stream
        String gongFile = "F:\\Codes\\Java\\OdbConn\\src\\com\\aplications\\whistle ringtone samsung.mp3";
        InputStream in = new FileInputStream(gongFile);

        // create an audiostream from the inputstream
        AudioStream audioStream = new AudioStream(in);

        // play the audio clip with the audioplayer class
        AudioPlayer.player.start(audioStream);
    }
}
