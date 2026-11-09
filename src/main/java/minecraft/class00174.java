package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Map;

public class class00174 {
   static final class08524<CommandSyntaxException> N = class08524.N(new SimpleCommandExceptionType(class00392.L("snbt.parser.expected_string_uuid")));
   static final class08524<CommandSyntaxException> y = class08524.N(new SimpleCommandExceptionType(class00392.L("snbt.parser.expected_number_or_boolean")));
   public static final String L = "true";
   public static final String u = "false";
   public static final Map<class00164, class00171> i = Map.of(new class00164("bool", 1), new class00152(), new class00164("uuid", 1), new class00180());
   public static final class02350<StringReader> R = new class00156();

   public class00174() {
      super();
   }
}
