package kr.rojae.webflux.entry;

import kr.rojae.webflux.movie.Movie;
import kr.rojae.webflux.movie.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping("api/v1/movies/1")
    public Movie moviesList1(){
        return movieService.movieList1();
    }

    @GetMapping("api/v1/movies/2")
    public Mono<Movie> moviesList2(){
        return movieService.movieList2();
    }

}
