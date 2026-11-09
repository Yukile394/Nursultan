package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.Reader;

public class class08314 {
   public class08314() {
      super();
   }

   public static JsonElement N(Reader var0) throws JsonIOException, JsonSyntaxException {
      return JsonParser.parseReader(var0);
   }

   public static JsonElement N(String var0) throws JsonSyntaxException {
      return JsonParser.parseString(var0);
   }
}
