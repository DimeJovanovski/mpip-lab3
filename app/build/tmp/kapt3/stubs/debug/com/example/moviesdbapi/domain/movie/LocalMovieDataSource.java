package com.example.moviesdbapi.domain.movie;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0012\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/moviesdbapi/domain/movie/LocalMovieDataSource;", "", "delete", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "", "Lcom/example/moviesdbapi/domain/movie/model/Movie;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "movie", "(Lcom/example/moviesdbapi/domain/movie/model/Movie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAll", "movies", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchMovies", "query", "app_debug"})
public abstract interface LocalMovieDataSource {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.example.moviesdbapi.domain.movie.model.Movie movie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object saveAll(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.moviesdbapi.domain.movie.model.Movie> movies, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAll(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.moviesdbapi.domain.movie.model.Movie>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object searchMovies(@org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.moviesdbapi.domain.movie.model.Movie>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}