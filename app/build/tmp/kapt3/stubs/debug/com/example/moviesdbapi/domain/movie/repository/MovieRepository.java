package com.example.moviesdbapi.domain.movie.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/moviesdbapi/domain/movie/repository/MovieRepository;", "", "remoteMovieDataSource", "Lcom/example/moviesdbapi/domain/movie/RemoteMovieDataSource;", "localMovieDataSource", "Lcom/example/moviesdbapi/domain/movie/LocalMovieDataSource;", "networkConnectivity", "Lcom/example/moviesdbapi/utils/NetworkConnectivity;", "(Lcom/example/moviesdbapi/domain/movie/RemoteMovieDataSource;Lcom/example/moviesdbapi/domain/movie/LocalMovieDataSource;Lcom/example/moviesdbapi/utils/NetworkConnectivity;)V", "listMovies", "", "Lcom/example/moviesdbapi/domain/movie/model/Movie;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryMovies", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MovieRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.moviesdbapi.domain.movie.RemoteMovieDataSource remoteMovieDataSource = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.moviesdbapi.domain.movie.LocalMovieDataSource localMovieDataSource = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.moviesdbapi.utils.NetworkConnectivity networkConnectivity = null;
    
    public MovieRepository(@org.jetbrains.annotations.NotNull
    com.example.moviesdbapi.domain.movie.RemoteMovieDataSource remoteMovieDataSource, @org.jetbrains.annotations.NotNull
    com.example.moviesdbapi.domain.movie.LocalMovieDataSource localMovieDataSource, @org.jetbrains.annotations.NotNull
    com.example.moviesdbapi.utils.NetworkConnectivity networkConnectivity) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object queryMovies(@org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.moviesdbapi.domain.movie.model.Movie>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object listMovies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.moviesdbapi.domain.movie.model.Movie>> $completion) {
        return null;
    }
}