now="$(date)"
printf "The files are being committed on %s\n" "$now"
git add -A
git commit -m "$now"
git push origin master
