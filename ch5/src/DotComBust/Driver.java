package DotComBust;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;
import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Sequencer sequencer;
        try {
            sequencer = MidiSystem.getSequencer();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } finally {
        }
    }
}

