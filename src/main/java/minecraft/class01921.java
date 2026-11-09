package minecraft;

import Nursultan.class09540;
import com.mojang.serialization.Lifecycle;
import java.util.function.Predicate;

public interface class01921<T> extends class01905<T>, class02042<T> {
   class05946<? extends class00751<? extends T>> i();

   default class01921<T> N(Predicate<T> var1) {
      return new class09540<>(this, var1);
   }

   default class01921<T> N(class03767 var1) {
      return class02995.Li.contains(this.i()) ? this.N(var1x -> ((class02995)var1x).N(var1)) : this;
   }

   Lifecycle R();
}
