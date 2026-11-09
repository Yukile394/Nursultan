package minecraft;

import Nursultan.class10549;
import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class class05946<T> {
   private static final ConcurrentMap<class10549, class05946<?>> N = new MapMaker().weakValues().makeMap();
   private final class01894 y;
   private final class01894 L;

   public boolean L(class05946<? extends class00751<?>> var1) {
      return this.y.equals(var1.N());
   }

   public class05946<class00751<T>> L() {
      return N(this.y);
   }

   private class05946(class01894 var1, class01894 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.y + " / " + this.L + "]";
   }

   public <E> Optional<class05946<E>> u(class05946<? extends class00751<E>> var1) {
      return this.L(var1) ? Optional.of((class05946<E>)this) : Optional.empty();
   }

   public class01894 y() {
      return this.y;
   }

   public static <T> class02362<ByteBuf, class05946<T>> y(class05946<? extends class00751<T>> var0) {
      return class01894.y.N_10(var1 -> N(var0, var1), class05946::N);
   }

   public static <T> Codec<class05946<T>> N(class05946<? extends class00751<T>> var0) {
      return class01894.N.xmap(var1 -> N(var0, var1), class05946::N);
   }

   private static <T> class05946<T> N(class01894 var0, class01894 var1) {
      return (class05946<T>)N.computeIfAbsent(new class10549(var0, var1), var0x -> new class05946(var0x.N(), var0x.y()));
   }

   public static <T> class05946<class00751<T>> N(class01894 var0) {
      return N(class04227.N, var0);
   }

   public class01894 N() {
      return this.L;
   }

   public static <T> class05946<T> N(class05946<? extends class00751<T>> var0, class01894 var1) {
      return N(var0.L, var1);
   }
}
