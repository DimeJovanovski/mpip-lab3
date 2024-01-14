package com.example.moviesdbapi.adapters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001f\u0012\u0018\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0014\u0010\u0018\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lcom/example/moviesdbapi/adapters/MovieAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/moviesdbapi/adapters/MovieAdapter$MovieViewHolder;", "movies", "Ljava/util/ArrayList;", "Lcom/example/moviesdbapi/domain/movie/model/Movie;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "onItemClicked", "Lkotlin/Function1;", "", "getOnItemClicked", "()Lkotlin/jvm/functions/Function1;", "setOnItemClicked", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateMovies", "newMovies", "", "MovieViewHolder", "app_debug"})
public final class MovieAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.moviesdbapi.adapters.MovieAdapter.MovieViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.example.moviesdbapi.domain.movie.model.Movie> movies = null;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super com.example.moviesdbapi.domain.movie.model.Movie, kotlin.Unit> onItemClicked;
    
    public MovieAdapter(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.example.moviesdbapi.domain.movie.model.Movie> movies) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<com.example.moviesdbapi.domain.movie.model.Movie, kotlin.Unit> getOnItemClicked() {
        return null;
    }
    
    public final void setOnItemClicked(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super com.example.moviesdbapi.domain.movie.model.Movie, kotlin.Unit> p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.moviesdbapi.adapters.MovieAdapter.MovieViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.moviesdbapi.adapters.MovieAdapter.MovieViewHolder holder, int position) {
    }
    
    public final void updateMovies(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.moviesdbapi.domain.movie.model.Movie> newMovies) {
    }
    
    public MovieAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/moviesdbapi/adapters/MovieAdapter$MovieViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "imageView", "Landroid/widget/ImageView;", "titleText", "Landroid/widget/TextView;", "yearText", "bind", "", "movie", "Lcom/example/moviesdbapi/domain/movie/model/Movie;", "app_debug"})
    public static final class MovieViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView imageView;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView titleText;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView yearText;
        
        public MovieViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.example.moviesdbapi.domain.movie.model.Movie movie) {
        }
    }
}