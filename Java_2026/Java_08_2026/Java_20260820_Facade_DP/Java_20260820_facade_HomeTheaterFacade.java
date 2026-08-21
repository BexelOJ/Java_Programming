public class Java_20260820_facade_HomeTheaterFacade {

    private Java_20260820_facade_Amplifier amplifier;
    private Java_20260820_facade_StreamingPlayer streamingPlayer;
    private Java_20260820_facade_Projector projector;
    private Java_20260820_facade_TheaterLights lights;
    private Java_20260820_facade_Screen screen;
    private Java_20260820_facade_PopcornPopper popper;

    public Java_20260820_facade_HomeTheaterFacade(
            Java_20260820_facade_Amplifier amplifier,
            Java_20260820_facade_StreamingPlayer streamingPlayer,
            Java_20260820_facade_Projector projector,
            Java_20260820_facade_TheaterLights lights,
            Java_20260820_facade_Screen screen,
            Java_20260820_facade_PopcornPopper popper) {

        this.amplifier = amplifier;
        this.streamingPlayer = streamingPlayer;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {

        System.out.println("\nGet ready to watch a movie...\n");

        popper.on();
        popper.pop();

        lights.dim(10);

        screen.down();

        projector.on();
        projector.setInput("Streaming Player");
        projector.wideScreenMode();

        amplifier.on();
        amplifier.setStreamingPlayer("Streaming Player");
        amplifier.setSurroundSound();
        amplifier.setVolume(5);

        streamingPlayer.on();
        streamingPlayer.play(movie);
    }

    public void endMovie() {

        System.out.println("\nShutting movie theater down...\n");

        popper.off();

        lights.on();

        screen.up();

        projector.off();

        amplifier.off();

        streamingPlayer.stop();
        streamingPlayer.off();
    }
}

