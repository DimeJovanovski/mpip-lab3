package com.example.moviesdbapi.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/example/moviesdbapi/utils/NetworkConnectivity;", "Landroidx/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isNetworkAvailable", "", "()Z", "setNetworkAvailable", "(Z)V", "initializeNetworkAvailability", "", "Companion", "app_debug"})
public final class NetworkConnectivity implements androidx.lifecycle.LifecycleObserver {
    private boolean isNetworkAvailable = false;
    @org.jetbrains.annotations.Nullable
    private static com.example.moviesdbapi.utils.NetworkConnectivity instance;
    @org.jetbrains.annotations.NotNull
    public static final com.example.moviesdbapi.utils.NetworkConnectivity.Companion Companion = null;
    
    public NetworkConnectivity(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final boolean isNetworkAvailable() {
        return false;
    }
    
    public final void setNetworkAvailable(boolean p0) {
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final void initializeNetworkAvailability(android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/moviesdbapi/utils/NetworkConnectivity$Companion;", "", "()V", "instance", "Lcom/example/moviesdbapi/utils/NetworkConnectivity;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.moviesdbapi.utils.NetworkConnectivity instance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}