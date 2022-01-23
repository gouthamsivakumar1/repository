package com.example.employee;

import java.lang.System;

/**
 * The application level class
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002\u00a8\u0006\b"}, d2 = {"Lcom/example/employee/App;", "Landroidx/multidex/MultiDexApplication;", "()V", "onCreate", "", "setUpKoin", "setupCoil", "Companion", "app_debug"})
public final class App extends androidx.multidex.MultiDexApplication {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.employee.App.Companion Companion = null;
    public static coil.ImageLoader coilImageLoader;
    
    public App() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    /**
     * for dependency injection
     */
    private final void setUpKoin() {
    }
    
    /**
     * for image loading
     */
    private final void setupCoil() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/employee/App$Companion;", "", "()V", "coilImageLoader", "Lcoil/ImageLoader;", "getCoilImageLoader", "()Lcoil/ImageLoader;", "setCoilImageLoader", "(Lcoil/ImageLoader;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final coil.ImageLoader getCoilImageLoader() {
            return null;
        }
        
        public final void setCoilImageLoader(@org.jetbrains.annotations.NotNull()
        coil.ImageLoader p0) {
        }
    }
}