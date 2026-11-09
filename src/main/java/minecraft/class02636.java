package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.ListBuilder;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class class02636 implements DynamicOps<class06244> {
   public static final class02636 N = new class02636();
   private static final MapLike<class06244> y = new class02645();

   public class06244 emptyList() {
      return class06244.field_17274;
   }

   public DataResult<String> getStringValue(class06244 var1) {
      return DataResult.success("");
   }

   public DataResult<Stream<class06244>> getStream(class06244 var1) {
      return DataResult.success(Stream.empty());
   }

   private class02636() {
      super();
   }

   @Override
   public String toString() {
      return "Null";
   }

   public DataResult<Consumer<Consumer<class06244>>> getList(class06244 var1) {
      return DataResult.success((Consumer<Consumer>)var0 -> {});
   }

   public DataResult<ByteBuffer> getByteBuffer(class06244 var1) {
      return DataResult.success(ByteBuffer.wrap(new byte[0]));
   }

   public DataResult<Consumer<BiConsumer<class06244, class06244>>> getMapEntries(class06244 var1) {
      return DataResult.success((Consumer<BiConsumer>)var0 -> {});
   }

   public DataResult<LongStream> getLongStream(class06244 var1) {
      return DataResult.success(LongStream.empty());
   }

   public DataResult<IntStream> getIntStream(class06244 var1) {
      return DataResult.success(IntStream.empty());
   }

   public DataResult<Stream<Pair<class06244, class06244>>> getMapValues(class06244 var1) {
      return DataResult.success(Stream.empty());
   }

   public class06244 emptyMap() {
      return class06244.field_17274;
   }

   public class06244 createList(Stream<class06244> var1) {
      return class06244.field_17274;
   }

   public DataResult<Boolean> getBooleanValue(class06244 var1) {
      return DataResult.success(false);
   }

   public class06244 createByteList(ByteBuffer var1) {
      return class06244.field_17274;
   }

   public class06244 createMap(Map<class06244, class06244> var1) {
      return class06244.field_17274;
   }

   public <U> U convertTo(DynamicOps<U> var1, class06244 var2) {
      return (U)var1.empty();
   }

   public class06244 createNumeric(Number var1) {
      return class06244.field_17274;
   }

   public class06244 remove(class06244 var1, String var2) {
      return var1;
   }

   public class06244 createLongList(LongStream var1) {
      return class06244.field_17274;
   }

   public class06244 createIntList(IntStream var1) {
      return class06244.field_17274;
   }

   public class06244 createFloat(float var1) {
      return class06244.field_17274;
   }

   public class06244 createLong(long var1) {
      return class06244.field_17274;
   }

   public DataResult<class06244> mergeToList(class06244 var1, class06244 var2) {
      return DataResult.success(class06244.field_17274);
   }

   public class06244 createInt(int var1) {
      return class06244.field_17274;
   }

   public DataResult<class06244> mergeToList(class06244 var1, List<class06244> var2) {
      return DataResult.success(class06244.field_17274);
   }

   public class06244 createString(String var1) {
      return class06244.field_17274;
   }

   public class06244 createBoolean(boolean var1) {
      return class06244.field_17274;
   }

   public class06244 createDouble(double var1) {
      return class06244.field_17274;
   }

   public DataResult<Number> getNumberValue(class06244 var1) {
      return DataResult.success(0);
   }

   public DataResult<class06244> mergeToMap(class06244 var1, Map<class06244, class06244> var2) {
      return DataResult.success(class06244.field_17274);
   }

   public DataResult<class06244> mergeToMap(class06244 var1, MapLike<class06244> var2) {
      return DataResult.success(class06244.field_17274);
   }

   public class06244 empty() {
      return class06244.field_17274;
   }

   public class06244 createMap(Stream<Pair<class06244, class06244>> var1) {
      return class06244.field_17274;
   }

   public DataResult<class06244> mergeToMap(class06244 var1, class06244 var2, class06244 var3) {
      return DataResult.success(class06244.field_17274);
   }

   public class06244 createByte(byte var1) {
      return class06244.field_17274;
   }

   public class06244 createShort(short var1) {
      return class06244.field_17274;
   }

   public DataResult<MapLike<class06244>> getMap(class06244 var1) {
      return DataResult.success(y);
   }

   public RecordBuilder<class06244> mapBuilder() {
      return new class02643(this);
   }

   public ListBuilder<class06244> listBuilder() {
      return new class02623(this);
   }
}
