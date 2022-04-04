package hu.tomicompany.prog4.sajatapp.util;

import java.util.concurrent.atomic.AtomicLong;

public class IdProvider {
    private static final IdProvider INSTANCE = new IdProvider();

    private AtomicLong id = new AtomicLong(1);

    public IdProvider()
    {
    }

    public static IdProvider getInstance()
    {
        return INSTANCE;
    }

    public long nextiD()
    {
        return this.id.getAndIncrement();
    }
}
