# Java lihtandmetüübid

Javas kuulub lihtandmetüüpide alla 8 andmetüüpi, millest 6 on numbrilised:

**Byte** (Numbriline andmetüüp) on 8-bitine (1 bait) täisarv. See on vahemikus -128 kuni 127. Javas kasutaksime byte-i nii:
```
byte a = 23;
```
**Short** (Numbriline andmetüüp) on 16-bitine (2 baiti) täisarv. See on vahemikus -32768 kuni 32767. Javas näeks short-i kasutamine välja nii:
```
short a = 1234;
```
**Int** (Numbriline andmetüüp) on 32-bitine (4 baiti) täisarv. See on vahemikus -2147483648 kuni 2147483647. Javas int-i kasutamine:
```
int arv = -23865;
```
**Long** (Numbriline andmetüüp) on 64-bitine (8 baiti) täisarv vahemikus -9223372036854775808 kuni 9223372036854775807. Javas long-i kasutamine:
```
long arv2 = 56;
```
**Float** (Numbriline andmetüüp) on 32-bitine (4 baiti) ujukomaarv. Floati vahemik on 3.40282347 x 10^38 kuni 1.40239846 x 10^-45. Selle andmetüübi kasutamise puhul on tähtis märkida väärtuse lõppu "f", näiteks:
```
float arv3 = 25.89f;
```
**Double** (Numbriline andmetüüp) on 64-bitine (8 baiti) ujukomaarv. Selle vahemik on 1.7976931348623157 x 10^308 kuni 4.9406564584124654 x 10^-324. Double on sarnane float-iga, kuid on sellest komakohtade puhul täpsem. Double-i väärtuse lõppu "d" või "D" lisamine ei ole kohustuslik. Javas näeb double-i kasutamine välja selline:
```
double arv4 = 29.2873;
```
**Char** on 16-bitine Unicode sümbol. Unicode tähendab *universal characters code*, mis sisaldab kõigi tähtede, numbrite ja sümbolite koode. Mõned char-i kasutusnäited:
```
char a = 'a';
char b = 'B';
char ch = '\u0031'; // Mis on võrdne numbri 1-ga.
char nr = '2';
```
**Boolean** on tõeväärtustüüp, mille ainsad väärtused saavad ainult olla **True** või **False**. Kasutusnäiteid:
```
boolean isGreen = false;
boolean isBlue = true;
```
