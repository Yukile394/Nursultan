package minecraft;

import Nursultan.class09430;
import Nursultan.class09431;
import com.mojang.logging.LogUtils;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public interface class01042 extends class01929 {
   Logger N = LogUtils.getLogger();
   class01022 y = new class01014(Map.of()).method_40316();

   @Override
   default Stream<class05946<? extends class00751<?>>> y() {
      return this.method_40311().map(var0 -> var0.N());
   }

   static class01022 N(class00751<? extends class00751<?>> var0) {
      return new class09431(var0);
   }

   default <E> class00751<E> L(class05946<? extends class00751<? extends E>> var1) {
      return this.<E>method_46759(var1).orElseThrow(() -> new IllegalStateException("Missing registry: " + var1));
   }

   @Override
   <E> Optional<class00751<E>> method_46759(class05946<? extends class00751<? extends E>> var1);

   Stream<class01012<?>> method_40311();

   default class01022 method_40316() {
      return new class09430(this, this.method_40311().map(class01012::L));
   }
}
