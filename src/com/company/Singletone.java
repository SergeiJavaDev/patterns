package com.company;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Singletone {

    private Singletone() {

    }
    private static final class SingletoneHolder{
        public static final Singletone INSTANCE_HOLDER = new Singletone();
    }
    public static  Singletone getInstance() {



    return SingletoneHolder.INSTANCE_HOLDER;
    }

}
