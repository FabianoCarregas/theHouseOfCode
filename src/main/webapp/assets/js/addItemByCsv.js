$('.btn-new-csv').click((event) => {
    event.preventDefault();
    $('.wrapper-modal').toggle()
})

$('.select-type-csv').change(function (){
    let value = $('.select-type-csv option:selected').text();
    if (value === 'Book') console.log("ébook")
    if (value === 'Author') console.log("éauthor")
})

$('.btn-cancel').click(function () {
    $('.wrapper-modal').toggle()
})