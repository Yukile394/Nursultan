package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public interface class04439 {
   MapCodec<? extends class04439> N();

   default class05216 N(@Nullable class07701 var1, @Nullable class07049 var2, int var3) throws CommandSyntaxException {
      return class05216.N(this);
   }

   default <T> Optional<T> method_27660(class05935<T> var1, class00405 var2) {
      return Optional.empty();
   }

   default <T> Optional<T> method_27659(class05977<T> var1) {
      return Optional.empty();
   }
}
