package com.example.moviesdbapi.domain.movie.room;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0015\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/moviesdbapi/domain/movie/room/RoomMovieDataSource;", "Lcom/example/moviesdbapi/domain/movie/LocalMovieDataSource;", "movieDao", "Lcom/example/moviesdbapi/domain/movie/room/MovieDao;", "(Lcom/example/moviesdbapi/domain/movie/room/MovieDao;)V", "delete", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "", "Lcom/example/moviesdbapi/domain/movie/model/Movie;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "movie", "(Lcom/example/moviesdbapi/domain/movie/model/Movie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAll", "movies", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchMovies", "query", "app_debug"})
public final class RoomMovieDataSource implements com.example.moviesdbapi.domain.movie.LocalMovieDataSource {
    @org.jetbrains.annotations.NotNull
    private final com.example.moviesdbapi.domain.movie.room.MovieDao movieDao = null;
    
    public RoomMovieDataSource(@org.jetbrains.annotations.NotNull
    com.example.moviesdbapi.domain.movie.room.MovieDao movieDao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.example.moviesdbapi.domain.movie.model.Movie movie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object saveAll(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.moviesdbapi.domain.movie.model.Movie> movies, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getAll(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.moviesdbapi.domain.movie.model.Movie>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object searchMovies(@org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.moviesdbapi.domain.movie.model.Movie>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object delete(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}