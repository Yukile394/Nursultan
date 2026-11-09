package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.function.BiConsumer;

public record class02965<T>(class05946<? extends class00751<T>> key, Codec<T> elementCodec, boolean requiredNonEmpty) {

   public boolean L() {
      return this.requiredNonEmpty;
   }

   class02965(class05946<? extends class00751<T>> var1, Codec<T> var2) {
      this(var1, var2, false);
   }

   public class02965(class05946<? extends class00751<T>> key, Codec<T> elementCodec, boolean requiredNonEmpty) {
      this.key = key;
      this.elementCodec = elementCodec;
      this.requiredNonEmpty = requiredNonEmpty;
   }

   public Codec<T> y() {
      return this.elementCodec;
   }

   class02992<T> N(Lifecycle var1, Map<class05946<?>, Exception> var2) {
      class00731 class00731 = new class00731<>(this.key, var1);
      return new class02992<>(this, class00731, var2);
   }

   public void N(BiConsumer<class05946<? extends class00751<T>>, Codec<T>> var1) {
      var1.accept(this.key, this.elementCodec);
   }

   public class05946<? extends class00751<T>> N() {
      return this.key;
   }
}
