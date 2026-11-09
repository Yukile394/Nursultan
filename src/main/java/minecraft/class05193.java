package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class05193 implements ArgumentType<UUID> {
   public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("argument.uuid.invalid"));
   private static final Collection<String> y = Arrays.asList("dd12be42-52a9-4a91-a8a1-11c01849e498");
   private static final Pattern L = Pattern.compile("^([-A-Fa-f0-9]+)");

   public class05193() {
      super();
   }

   public UUID parse(StringReader var1) throws CommandSyntaxException {
      String s = var1.getRemaining();
      Matcher matcher = L.matcher(s);
      if (matcher.find()) {
         String s1 = matcher.group(1);

         try {
            UUID uuid = UUID.fromString(s1);
            var1.setCursor(var1.getCursor() + s1.length());
            return uuid;
         } catch (IllegalArgumentException illegalargumentexception) {
         }
      }

      throw N.createWithContext(var1);
   }

   public static UUID N(CommandContext<class07701> var0, String var1) {
      return (UUID)var0.getArgument(var1, UUID.class);
   }

   public static class05193 N() {
      return new class05193();
   }

   public Collection<String> getExamples() {
      return y;
   }
}
