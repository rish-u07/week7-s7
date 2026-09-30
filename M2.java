class M2 {

    static class Playlist {
        private String[] songs;
        private int songCount;

        Playlist(int size) {
            songs = new String[size];
            songCount = 0;
        }

        void addSong(String song) {
            if (songCount < songs.length) {
                songs[songCount] = song;
                songCount++;
            } else {
                System.out.println("Playlist is full");
            }
        }

        String[] getSongs() {
            String[] copy = new String[songCount];

            for (int i = 0; i < songCount; i++) {
                copy[i] = songs[i];
            }

            return copy;
        }

        int getSongCount() {
            return songCount;
        }
    }

    public static void main(String[] args) {

        Playlist p = new Playlist(10);

        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();

        System.out.println("Songs:");

        for (String song : copy) {
            System.out.println(song);
        }

        copy[0] = "Hacked";

        System.out.println("\nAfter modifying copy:");
        String[] original = p.getSongs();

        for (String song : original) {
            System.out.println(song);
        }

        System.out.println("Song count: " + p.getSongCount());
    }
}