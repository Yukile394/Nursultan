package minecraft;

import Nursultan.class09455;
import Nursultan.class09457;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.ListBuilder;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public abstract class class01278<T> implements DynamicOps<T> {
   protected final DynamicOps<T> N;

   protected class01278(DynamicOps<T> var1) {
      super();
      this.N = var1;
   }

   public T remove(T var1, String var2) {
      return (T)this.N.remove(var1, var2);
   }

   public T empty() {
      return (T)this.N.empty();
   }

   public T emptyList() {
      return (T)this.N.emptyList();
   }

   public DataResult<ByteBuffer> getByteBuffer(T var1) {
      return this.N.getByteBuffer(var1);
   }

   public T emptyMap() {
      return (T)this.N.emptyMap();
   }

   public DataResult<MapLike<T>> getMap(T var1) {
      return this.N.getMap(var1);
   }

   public T createMap(Map<T, T> var1) {
      return (T)this.N.createMap(var1);
   }

   public T createMap(Stream<Pair<T, T>> var1) {
      return (T)this.N.createMap(var1);
   }

   public T createLong(long var1) {
      return (T)this.N.createLong(var1);
   }

   public T createString(String var1) {
      return (T)this.N.createString(var1);
   }

   public DataResult<Number> getNumberValue(T var1) {
      return this.N.getNumberValue(var1);
   }

   public DataResult<Boolean> getBooleanValue(T var1) {
      return this.N.getBooleanValue(var1);
   }

   public DataResult<T> mergeToList(T var1, T var2) {
      return this.N.mergeToList(var1, var2);
   }

   public DataResult<T> mergeToList(T var1, List<T> var2) {
      return this.N.mergeToList(var1, var2);
   }

   public DataResult<Stream<Pair<T, T>>> getMapValues(T var1) {
      return this.N.getMapValues(var1);
   }

   public DataResult<String> getStringValue(T var1) {
      return this.N.getStringValue(var1);
   }

   public T createNumeric(Number var1) {
      return (T)this.N.createNumeric(var1);
   }

   public T createShort(short var1) {
      return (T)this.N.createShort(var1);
   }

   public DataResult<LongStream> getLongStream(T var1) {
      return this.N.getLongStream(var1);
   }

   public T createFloat(float var1) {
      return (T)this.N.createFloat(var1);
   }

   public T createDouble(double var1) {
      return (T)this.N.createDouble(var1);
   }

   public T createLongList(LongStream var1) {
      return (T)this.N.createLongList(var1);
   }

   public DataResult<IntStream> getIntStream(T var1) {
      return this.N.getIntStream(var1);
   }

   public T createBoolean(boolean var1) {
      return (T)this.N.createBoolean(var1);
   }

   public T createByteList(ByteBuffer var1) {
      return (T)this.N.createByteList(var1);
   }

   public T createIntList(IntStream var1) {
      return (T)this.N.createIntList(var1);
   }

   public boolean compressMaps() {
      return this.N.compressMaps();
   }

   public DataResult<Consumer<Consumer<T>>> getList(T var1) {
      return this.N.getList(var1);
   }

   public RecordBuilder<T> mapBuilder() {
      return new class09457<>(this, this.N.mapBuilder());
   }

   public DataResult<Stream<T>> getStream(T var1) {
      return this.N.getStream(var1);
   }

   public DataResult<T> mergeToMap(T var1, Map<T, T> var2) {
      return this.N.mergeToMap(var1, var2);
   }

   public DataResult<T> mergeToMap(T var1, T var2, T var3) {
      return this.N.mergeToMap(var1, var2, var3);
   }

   public DataResult<T> mergeToMap(T var1, MapLike<T> var2) {
      return this.N.mergeToMap(var1, var2);
   }

   public T createByte(byte var1) {
      return (T)this.N.createByte(var1);
   }

   public T createInt(int var1) {
      return (T)this.N.createInt(var1);
   }

   public T createList(Stream<T> var1) {
      return (T)this.N.createList(var1);
   }

   public <U> U convertTo(DynamicOps<U> var1, T var2) {
      return (U)(Objects.equals(var1, this.N) ? var2 : this.N.convertTo(var1, var2));
   }

   public DataResult<T> mergeToPrimitive(T var1, T var2) {
      return this.N.mergeToPrimitive(var1, var2);
   }

   public ListBuilder<T> listBuilder() {
      return new class09455<>(this, this.N.listBuilder());
   }

   public DataResult<Consumer<BiConsumer<T, T>>> getMapEntries(T var1) {
      return this.N.getMapEntries(var1);
   }
}
