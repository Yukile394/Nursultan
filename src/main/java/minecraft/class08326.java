package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.Strictness;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class class08326 {
   public class08326() {
      super();
   }

   public static JsonElement N(Reader var0) throws JsonIOException, JsonSyntaxException {
      try {
         JsonReader jsonreader = new JsonReader(var0);
         jsonreader.setStrictness(Strictness.STRICT);
         JsonElement jsonelement = JsonParser.parseReader(jsonreader);
         if (!jsonelement.isJsonNull() && jsonreader.peek() != JsonToken.END_DOCUMENT) {
            throw new JsonSyntaxException("Did not consume the entire document.");
         } else {
            return jsonelement;
         }
      } catch (NumberFormatException | MalformedJsonException malformedjsonexception) {
         throw new JsonSyntaxException(malformedjsonexception);
      } catch (IOException ioexception) {
         throw new JsonIOException(ioexception);
      }
   }

   public static JsonElement N(String var0) throws JsonSyntaxException {
      return N(new StringReader(var0));
   }
}
