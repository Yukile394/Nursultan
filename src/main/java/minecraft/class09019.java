package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Optional;

public interface class09019 extends class09037 {
   Optional<class08734> L();

   @Override
   default Optional<class08752> u() {
      return this.L().flatMap(class08734::y);
   }

   int y();

   @Override
   MapCodec<? extends class09019> N();
}
