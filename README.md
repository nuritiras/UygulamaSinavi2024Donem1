## Mobil Uygulamalar Dersi 1. Dönem 2. Yazılı Uygulama

SORULAR
(Önemli Not: Veri tipi ve isimlendirme seçimlerinde en uygun olanı tercih ediniz. Kendi uygulamam da örnek olarak İsim Soy isim için Nuri TIRAŞ, okul numarası için 571 değeri esas alınmış olup siz verilerinize göre bu değerleri değiştirmeniz gerekmektedir. KDV değeri %20 ve 1 $ = 35,22 TL olarak hesaplanacak.)
1. Android Studio programını çalıştırın.
2. Projects  > New Project > Empty Views Activty > IsminizSoyisminizNumaraniz(NuriTiras571) adında adinizsoyadiniz.com.tr kurumu için Kotlin programlama dilini kullanarak  bir proje oluşturunuz. (3P)
 
3. Mobil Geliştirme ortamında ConstraintLayout yerleşimini yandaki görünümü esas alarak alt alta yerleştiriniz. (27P)
a) “Bilgisayar Hesapla” Text View, renk:mavi(#0000FF), yazı boyutu:34sp, textAlignment:center, fontFamily:sans-serif-black
b) “Tasarım ve Kodlama : Isim Soyisim” Text View, renk:kirmizi(#FF0000), yazı boyutu:18sp, textAlignment:center, fontFamily: casual 
c) Diğer tüm Text Viewlerin yazı boyutu:18sp olacak.
d) İlk üç Edit Text nesnesi, id değerleri sırasıyla editTextCpu, numberRam, decimalPrice olacak ve diğer bilgileri şekle uygun olacak şekilde ayarlayınız.
e) “KDV dahil mi?” yazısını içeren ve yazı boyutu:18sp olan Switch nesnesini ekleyiniz.
f) Son iki EditText nesnesi, id değerleri sırasıyla totalDolar, tolalTl olacak ve varsayılan text değerleri (0.0) olacak şekilde ayarlayınız. Ayrıca bu iki nesne sadece bilgi göstermek amacıyla kullanılacak o yüzden bu nesnelere bilgi girişini engelleyiniz.
g) “EKLE” yazısını içeren, id değeri buttonAdd olan button nesnesini ekleyiniz.
h) “HESAPLA” yazısını içeren, id değeri buttonCalculate olan button nesnesini ekleyiniz. onClick değerini onClickCalculate olarak ayarlayınız.
i) “Adet: 0” yazısını içeren ve yazı boyutu:18sp olan TextView nesnesini ekleyiniz.
4. Bilgisayarların fiyat bilgisini tutan bir dizi oluşturunuz (Not: Dizi elaman sayısı belli değil) (5P)
 
5. Fiyat bilgisi dolar cinsinden parametre olarak girilen ve geriye fiyat bilgisini TL cinsinden değer döndüren bir metot (fonksiyon) yazınız. (10P)
 
6. Uygulamanın amacına uygun bir adet sınıf oluşturunuz. Sınıfa işlemci, ram ve fiyat parametrelerini içeren Kurucu veya Yapıcı Metot (Constructor) oluşturunuz. Sınıfa, fiyata KDV değerini ilave eden, geriye değer döndürmeyen bir metot (fonksiyon) yazınız. (15P)
 
7. EKLE butonuna tıklandığında (setOnClickListener metodu ile); ​(25P)
a) Sınıftan bir nesne oluşturunuz.
b) Oluşturduğunuz nesneye parametre bilgileri olarak EditText’lerdeki İşlemci, ram ve fiyat bilgileriniz veriniz.
c) “KDV dahil mi?”  Evet seçiliyse sınıf içerisindeki KDV dahil fiyatı hesaplayan fonksiyonu çağırınız.
d) EditText’lerden herhangi biri veya birkaçında bilgi eksikliği varsa uygulamanın çökmemesi adına Logcat ekranına fırlatılan hata mesajını yazan ve uygulama ekranına Tost mesajı olarak “Lütfen bilgileri eksiksiz olarak giriniz.” mesajını veriniz.
e) Eklenen her bilgisayarda Adet bilgisini 1 artırınız.
 
8. “HESAPLA” butonuna tıklandığında (onClick metodu ile); (15P)
a) For döngüsü kullanarak dizideki bilgisayar fiyatlarının toplamını hesaplayınız.
b) totalDolar id sine sahip EditText nesnesine dolar cinsinden toplam fiyatı yazdırınız.
c) totalTl id sine sahip EditText nesnesine 5. Soruda hazırladığınız fonksiyonu kullanarak TL cinsinden toplam fiyatı yazdırınız.
 
9. Projeyi zip file olarak Export ederek (Öğrenci Belgeleri) Z:\Ortak\11B\MU\ dizinine yükleyin.

​Hasan DAĞ​​Nuri TIRAŞ​​​​​​   Serdar TEMİZ
​Bilişim Teknolojileri Öğretmenleri​​ ​​​​    Okul Müdürü
 
 
 

<img width="435" alt="Ekran Resmi 2024-12-27 19 41 02" src="https://github.com/user-attachments/assets/09e5bf62-47eb-4b2a-adbf-9c8706dec76d" />
