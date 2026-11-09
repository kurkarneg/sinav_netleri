# Rapor

**Ad Soyad:Ege KARADUMAN**
**Numara:793**

## 1. Problem Analizi
Bize dogru ve yanlis sayilarini vererk 4 islem kullanmamizi saglayip netleri ve bos sayilarini if dongusu ile de ne kadar iyi yapip yapmadigini bulmamizi istiyor


## 2. Girdi - İşlem - Çıktı

**Girdiler:**
-dogru,yanlis

**İşlemler:**
-[bos = 20 - (dogru + yanlis)] and (net = dogru - yanlis / 4)

**Çıktılar:**
-("net sayisi: " + net + "  dogru sayisi: " + dogru + "  yanlis sayisi: " + yanlis + "  bos sayisi: " + bos + " netlerin cok iyi")

## 3. Matematiksel Formüller

-net = dogru - yanlis / 4

## 4. Sözde Kod (Pseudocode)

```
1.dogru sayisini al
2.yanlis sayisin al
3.gerekli islemleri belirli sirayla dogru bir sekilde yap
4.dogru sayisini, yanlis sayisini, bos sayisini, net sayisini ve basari durumunu cikti olarak kullaniciya sun
```

## 5. Akış Şeması

![Akış Şeması](docs/akis-semasi.png) Maalesefki assansor sorusunda png koydum amaaa caliksmadi nasil yapildigini cozene kadar yukleyemeyecegim ama en kisa srede ogrenecegim bu aksakliktan dolayi ozur dilerim.

## 6. Başarı Durumu Koşulları
Net aralığı	Başarı durumu
0–5	Geliştirilmeli
5'ten büyük – 10	Orta
10'dan büyük – 15	İyi
15'ten büyük – 20	Çok iyi bu kismi direk sizin branchten koyalayip yapistirdim cunku sadece orada oyle bir sey yaziyordu o yuzden oradakii yazacagiz diye dusundum


## 7. Test Sonuçları

| Doğru | Yanlış | Beklenen | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 20 | 0 | Net 20, Çok iyi | net sayisi: 20.0  dogru sayisi: 20.0  yanlis sayisi: 0.0  bos sayisi: 0.0 netlerin cok iyi | True |
| 15 | 4 | Net 14, İyi | net sayisi: 14.0  dogru sayisi: 15.0  yanlis sayisi: 4.0  bos sayisi: 1.0 netlerin iyi | True |
| 10 | 8 | Net 8, Orta | net sayisi: 8.0  dogru sayisi: 10.0  yanlis sayisi: 8.0  bos sayisi: 2.0 netlerin orta | True |
| 5 | 0 | Net 5, Geliştirilmeli | net sayisi: 5.0  dogru sayisi: 5.0  yanlis sayisi: 0.0  bos sayisi: 15.0 netlerin gelistirilmeli | True |
| 0 | 20 | Net -5, Geliştirilmeli | net sayisi: -5.0  dogru sayisi: 0.0  yanlis sayisi: 20.0  bos sayisi: 0.0 Netin o kadar kotu ki eksi nete sahipsin

 | True |
| 10 | 10 | Net 7,5, Orta | net sayisi: 7.5  dogru sayisi: 10.0  yanlis sayisi: 10.0  bos sayisi: 0.0 netlerin orta | True |
| 15 | 10 | Geçersiz giriş | Gecersiz veri tespit edilmistir sistem kendini 5 saniye icinde imha edecektir
5
4
3
2
1
Bommmmmmmm
 | True |
| 12 | 9 | Geçersiz giriş | Gecersiz veri tespit edilmistir sistem kendini 5 saniye icinde imha edecektir
5
4
3
2
1
Bommmmmmmm | True |
| -1 | 5 | Geçersiz giriş | Gecersiz veri tespit edilmistir sistem kendini 5 saniye icinde imha edecektir
5
4
3
2
1
Bommmmmmmm
 | True |
