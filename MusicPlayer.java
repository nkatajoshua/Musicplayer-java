import java.util.ArrayList;

public class MusicPlayer {
    ArrayList<String> songs = new ArrayList<>();
    int currentSongIndex = -1;
    boolean isPlaying = false;

    public void addSong(String song) {
        songs.add(song);
        System.out.println(song + " has been added successfully!");
    }

    public void playSong(int index) {
        if (index >= 0 && index < songs.size()) {
            currentSongIndex = index;
            isPlaying = true;
            System.out.println("Playing: " + songs.get(index) + " [index: " + index + "]");
        } else {
            System.out.println("Invalid song index!");
        }
    }

    public void stopSong() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Stopped playing: " + songs.get(currentSongIndex));
        }
    }

    public void viewSongs() {
        for (int i = 0; i < songs.size(); i++) {
            System.out.println(i + ": " + songs.get(i));
        }
    }

    public void deleteSong(int index) {
        if (index >= 0 && index < songs.size()) {
            if (index == currentSongIndex) {
                isPlaying = false;
            }
            songs.remove(index);
            System.out.println("Song deleted successfully!");
        } else {
            System.out.println("Invalid song index!");
        }
    }

    public static void main(String[] args) {
        MusicPlayer myPlayer = new MusicPlayer();
        myPlayer.addSong("God is able");
        myPlayer.addSong("Just like Jesus");
        myPlayer.addSong("Worthy is your name");
        myPlayer.playSong(0);
    }

}