package com.example.moviesdbapi.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/moviesdbapi/ui/MoviesViewModel;", "Landroidx/lifecycle/ViewModel;", "movieRepository", "Lcom/example/moviesdbapi/domain/movie/repository/MovieRepository;", "(Lcom/example/moviesdbapi/domain/movie/repository/MovieRepository;)V", "_moviesLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/moviesdbapi/domain/movie/model/Movie;", "getMoviesLiveData", "Landroidx/lifecycle/LiveData;", "listAll", "", "search", "query", "", "app_debug"})
public final class MoviesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.moviesdbapi.domain.movie.repository.MovieRepository movieRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.moviesdbapi.domain.movie.model.Movie>> _moviesLiveData = null;
    
    public MoviesViewModel(@org.jetbrains.annotations.NotNull
    com.example.moviesdbapi.domain.movie.repository.MovieRepository movieRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.moviesdbapi.domain.movie.model.Movie>> getMoviesLiveData() {
        return null;
    }
    
    public final void search(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    public final void listAll() {
    }
}