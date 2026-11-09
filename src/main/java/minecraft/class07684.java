package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public interface class07684<T> {
   private static boolean y(CharSequence var0) {
      int i = var0.length();
      return i > 0 && var0.charAt(i - 1) == '\\';
   }

   static <T extends class01711<T>> class07684<T> N(class01894 var0, CommandDispatcher<T> var1, T var2, List<String> var3) {
      class01745 class01745 = new class01745();

      for (int i = 0; i < var3.size(); i++) {
         int j = i + 1;
         String s = ((String)var3.get(i)).trim();
         String s1;
         if (y(s)) {
            StringBuilder stringbuilder = new StringBuilder(s);

            do {
               if (++i == var3.size()) {
                  throw new IllegalArgumentException("Line continuation at end of file");
               }

               stringbuilder.deleteCharAt(stringbuilder.length() - 1);
               String s2 = ((String)var3.get(i)).trim();
               stringbuilder.append(s2);
               N(stringbuilder);
            } while (y(stringbuilder));

            s1 = stringbuilder.toString();
         } else {
            s1 = s;
         }

         N(s1);
         StringReader stringreader = new StringReader(s1);
         if (stringreader.canRead() && stringreader.peek() != '#') {
            if (stringreader.peek() == '/') {
               stringreader.skip();
               if (stringreader.peek() == '/') {
                  throw new IllegalArgumentException(
                     "Unknown or invalid command '" + s1 + "' on line " + j + " (if you intended to make a comment, use '#' not '//')"
                  );
               }

               String s3 = stringreader.readUnquotedString();
               throw new IllegalArgumentException(
                  "Unknown or invalid command '" + s1 + "' on line " + j + " (did you mean '" + s3 + "'? Do not use a preceding forwards slash.)"
               );
            }

            if (stringreader.peek() == '$') {
               class01745.N(s1.substring(1), j, (T)var2);
            } else {
               try {
                  class01745.N(N(var1, (T)var2, stringreader));
               } catch (CommandSyntaxException commandsyntaxexception) {
                  throw new IllegalArgumentException("Whilst parsing command on line " + j + ": " + commandsyntaxexception.getMessage());
               }
            }
         }
      }

      return class01745.N(var0);
   }

   static <T extends class01711<T>> class01716<T> N(CommandDispatcher<T> var0, T var1, StringReader var2) throws CommandSyntaxException {
      ParseResults parseresults = var0.parse(var2, var1);
      class07686.N(parseresults);
      Optional optional = ContextChain.tryFlatten(parseresults.getContext().build(var2.getString()));
      if (optional.isEmpty()) {
         throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext(parseresults.getReader());
      } else {
         return new class01731<>(var2.getString(), (ContextChain<T>)optional.get());
      }
   }

   static void N(CharSequence var0) {
      if (var0.length() > 2000000) {
         CharSequence charsequence = var0.subSequence(0, Math.min(512, 2000000));
         throw new IllegalStateException("Command too long: " + var0.length() + " characters, contents: " + charsequence + "...");
      }
   }

   class01747<T> N(@Nullable class07001 var1, CommandDispatcher<T> var2) throws class01878;

   class01894 N();
}
