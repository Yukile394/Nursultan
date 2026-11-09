package minecraft;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

class class00052 extends TypeAdapter<class04980> {
   private class00052() {
      super();
   }

   public void write(JsonWriter var1, class04980 var2) throws IOException {
      var1.jsonValue(new class04968().N(var2));
   }

   public class04980 read(JsonReader var1) throws IOException {
      String s = var1.nextString();
      return class04980.N(new class04968(), s);
   }
}
