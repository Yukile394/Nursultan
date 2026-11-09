package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.jspecify.annotations.Nullable;

public interface class01711<T extends class01711<T>> extends class08168 {
   default T w() {
      return this.y(class03102.N);
   }

   class03102 T();

   CommandDispatcher<T> l();

   boolean d();

   static <T extends class01711<T>> ResultConsumer<T> k() {
      return (var0, var1, var2) -> ((class01711)var0.getSource()).T().onResult(var1, var2);
   }

   T y(class03102 var1);

   default void N(CommandSyntaxException var1, boolean var2, @Nullable class01704 var3) {
      this.N(var1.getType(), var1.getRawMessage(), var2, var3);
   }

   void N(CommandExceptionType var1, Message var2, boolean var3, @Nullable class01704 var4);
}
