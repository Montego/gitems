<#import "parts/common.ftl" as c>

<@c.page>
    <hr>
    <form action="/logout" method="post">
        <input type="hidden" name="_csrf" value="{_csrf.token}">
        <input type="submit" value="Sign out">
    </form>
    <div class="uk-text-center" uk-grid>

        <div class="uk-width-3-4 ">
            <div class="container">
                <div class="grid">
                    <div uk-card-default>
                        <a class="grid-item" href="#">
                            Фильмы
                        </a>
                    </div>
                    <div>
                        <a class="grid-item" href="#">
                            Записка №2
                        </a>
                    </div>
                    <div>
                        <a class="grid-item" href="#">
                            Записка №3
                        </a>
                    </div>
                    <div>
                        <a class="grid-item" href="#">
                            Записка №1
                        </a>
                    </div>
                    <div>
                        <a class="grid-item" href="#">
                            Записка №1
                        </a>
                    </div>
                    <div>
                        <a class="grid-item" href="#">
                            Записка №1
                        </a>
                    </div>

                    <div>
                        <a class="grid-item" href="#">
                            Add new category
                        </a>
                    </div>
                </div>
            </div>
        </div>
    <div class="uk-width-1-4">
        <div class="uk-card uk-card-default uk-card-body"><a class="" href="#">1-4 </a></div>
    </div>
    </div>



</@c.page>