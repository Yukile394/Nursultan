package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;

public interface class06521<T extends class02950> {
   Codec<class06521<?>> R = class04206.j.T().dispatch(class06521::method_8119, class06514::N);
   Codec<class05946<class06521<?>>> M = class05946.N(class04227.yV);
   class02362<class04247, class06521<?>> B = class02389.N(class04227.Ns).y(class06521::method_8119, class06514::y);

   default boolean L() {
      return true;
   }

   class00305 i();

   class05838<? extends class06521<T>> u();

   default String y() {
      return "";
   }

   default List<class00265> N() {
      return List.of();
   }

   class06514<? extends class06521<T>> method_8119();

   class02754 method_61671();

   default boolean method_8118() {
      return false;
   }

   boolean method_8115(T var1, class07299 var2);

   class06584 method_8116(T var1, class01929 var2);
}
