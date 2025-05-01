public record Pelicula(String title,
                       int episode_id,
                       String opening_crawl,
                       String director,
                       String producer,
                       String release_date) {

    @Override
    public String toString() {
        return "Título: " + title + "\n" +
                "Episodio: " + episode_id + "\n" +
                "Director: " + director + "\n" +
                "Productor: " + producer + "\n" +
                "Estreno: " + release_date + "\n";
    }
}
