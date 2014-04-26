use Math::BigInt;

$fac = Math::BigInt->new(1);

for (1..100) {
    $fac->bmul($_);
    @array[$_] = $fac->bstr();
}

chomp($num = <STDIN>);
for (1..$num) {
    $p = <STDIN>;
    print @array [$p] . "\n";