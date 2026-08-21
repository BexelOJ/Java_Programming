public class Java_20260820_facade_HomeTheaterTestDrive {

    public static void main(String[] args) {

        Java_20260820_facade_Amplifier amplifier =
                new Java_20260820_facade_Amplifier("Amplifier");

        Java_20260820_facade_StreamingPlayer streamingPlayer =
                new Java_20260820_facade_StreamingPlayer("Streaming Player");

        Java_20260820_facade_Projector projector =
                new Java_20260820_facade_Projector("Projector");

        Java_20260820_facade_TheaterLights lights =
                new Java_20260820_facade_TheaterLights("Theater Lights");

        Java_20260820_facade_Screen screen =
                new Java_20260820_facade_Screen("Screen");

        Java_20260820_facade_PopcornPopper popper =
                new Java_20260820_facade_PopcornPopper("Popcorn Popper");

        Java_20260820_facade_HomeTheaterFacade homeTheater =
                new Java_20260820_facade_HomeTheaterFacade(
                        amplifier,
                        streamingPlayer,
                        projector,
                        lights,
                        screen,
                        popper
                );

        homeTheater.watchMovie("Inception");

        homeTheater.endMovie();
    }
}

