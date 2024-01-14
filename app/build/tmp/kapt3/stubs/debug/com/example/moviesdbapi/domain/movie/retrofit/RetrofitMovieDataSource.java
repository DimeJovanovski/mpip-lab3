package com.example.moviesdbapi.domain.movie.retrofit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/moviesdbapi/domain/movie/retrofit/RetrofitMovieDataSource;", "Lcom/example/moviesdbapi/domain/movie/RemoteMovieDataSource;", "movieDbApi", "Lcom/example/moviesdbapi/domain/movie/retrofit/MovieDbApi;", "(Lcom/example/moviesdbapi/domain/movie/retrofit/MovieDbApi;)V", "search", "", "Lcom/example/moviesdbapi/domain/movie/model/Movie;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RetrofitMovieDataSource implements com.example.moviesdbapi.domain.movie.RemoteMovieDataSource {
    @org.jetbrains.annotations.NotNull
    private final com.example.moviesdbapi.domain.movie.retrofit.MovieDbApi movieDbApi = null;
    
    public RetrofitMovieDataSource(@org.jetbrains.annotations.NotNull
    com.example.moviesdbapi.domain.movie.retrofit.MovieDbApi movieDbApi) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object search(@org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.moviesdbapi.domain.movie.model.Movie>> $completion) {
        return null;
    }
}