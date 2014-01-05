#!/usr/bin/perl
$i = <>;
while($i--) {
	$_ = <>;
	($n1, $n2) = split(" ", $_);
	$_ = reverse (reverse($n1) + reverse($n2));
	$_ =~ s/^0*//;
	print "$_\n";
}